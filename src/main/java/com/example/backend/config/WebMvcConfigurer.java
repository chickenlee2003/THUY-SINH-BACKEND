//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//\
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**") // Cho phép tất cả các endpoint
//                        .allowedOrigins("http://localhost:3000") // Cho phép frontend từ domain này
//                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Các method HTTP được phép
//                        .allowedHeaders("*") // Cho phép tất cả các header
//                        .allowCredentials(true); // Cho phép gửi cookie
//            }
//        };
//    }
