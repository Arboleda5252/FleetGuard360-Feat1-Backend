@Component
public class JwtAuthFilter extends OncePerRequestFilter {
    
    @Autowired
    private JwtService jwtService;
    
    @Autowired   
    private UsuarioRepository usuarioRepository;
    
    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                     HttpServletResponse response,
                                     FilterChain filterChain) throws ServletException, IOException {
        String authHeader = request.getHeader("Authorization");
        
        if (isAuthHeaderValid(authHeader)) {
            String token = authHeader.substring(7);  // Extrae el token
            if (jwtService.isTokenValid(token)) {
                String correo = jwtService.extractUsername(token);
                Usuario usuario = findUsuarioByEmail(correo);
                if (usuario != null) {
                    authenticateUser(correo);
                }
            }
        }
        
        filterChain.doFilter(request, response);
    }
    
    // Extraer la validación del header de autenticación
    private boolean isAuthHeaderValid(String authHeader) {
        return authHeader != null && authHeader.startsWith("Bearer ");
    }
    
    // Buscar al usuario por correo
    private Usuario findUsuarioByEmail(String correo) {
        return usuarioRepository.findByEmail(correo).orElse(null);
    }
    
    // Configurar la autenticación de usuario
    private void authenticateUser(String correo) {
        UsernamePasswordAuthenticationToken authToken = 
            new UsernamePasswordAuthenticationToken(correo, null, List.of());
        SecurityContextHolder.getContext().setAuthentication(authToken);
    }
}

        filterChain.doFilter(request, response);
    }
}
