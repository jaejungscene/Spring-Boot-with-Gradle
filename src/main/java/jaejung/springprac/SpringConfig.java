package jaejung.springprac;

import jaejung.springprac.aop.TimeTraceAop;
import jaejung.springprac.repository.*;
import jaejung.springprac.service.MemberService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import javax.sql.DataSource;

@Configuration
public class SpringConfig {

//    @Bean
//    public GroupedOpenApi publicApi() {
//        return GroupedOpenApi.builder()
//                .group("v1-definition")
//                .pathsToMatch("/**")
//                .build();
//    }
//    @Bean
//    public OpenAPI springShopOpenAPI() {
//        return new OpenAPI()
//                .info(new Info().title("Bstagram API")
//                        .description("BMW 프로젝트 API 명세서입니다.")
//                        .version("v0.0.1"));
//    }
//    private DataSource dataSource;

    // @PersistenceContext
    // private EntityManager em;

    // private final MemberRepository memberRepository;
    // private final DataSource dataSource;

    // @Autowired
    // public SpringConfig(MemberRepository memberRepository){
    //     this.memberRepository = memberRepository;
    // }

//    public SpringConfig(DataSource dataSource){
//        this.dataSource = dataSource;
//    }

    // @Bean
    // public MemberService memberService(){
    //     return new MemberService(memberRepository());
    // }

//    @Bean
//    public TimeTraceAop timeTraceAop(){
//        return new TimeTraceAop();
//    }


    // @Bean
    // public MemberRepository memberRepository(){
    //     // return new MemoryMemberRepository();
    //     // return new JdbcMemberRepository(dataSource);
    //     //  return new JdbcTemplateMemberRepository();
    //     // return new JpaMemberRepository(em);
    //     return new SpringDataJpaMemberRepository() {
            
    //     };
    // }

}
