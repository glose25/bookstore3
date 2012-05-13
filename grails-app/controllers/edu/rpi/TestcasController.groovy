package edu.rpi

import org.springframework.security.annotation.Secured

class TestcasController {

    def index = { 
       render 'You made it to index okay'
    }

    @Secured("ROLE_ADMIN")
    def secured = { 
       render 'You made it to secured okay'
    }
}
