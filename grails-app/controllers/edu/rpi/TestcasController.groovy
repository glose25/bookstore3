package edu.rpi

//import org.springframework.security.annotation.Secured
import grails.plugins.springsecurity.Secured

class TestcasController {
    def springSecurityService


    def index = { 
       //render 'You made it to index okay'
       def authentication = springSecurityService.authentication
       def principal = authentication?.principal
       render "Testcas:: CAS has verified you as " + principal
    }

//    @Secured('ROLE_ADMIN')
    @Secured(['IS_AUTHENTICATED_FULLY'])    
    def secured = { 
       render 'You made it to secured okay'
    }
}
