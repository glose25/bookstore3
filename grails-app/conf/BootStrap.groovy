import edu.rpi.UserRole
import edu.rpi.Role
import edu.rpi.User

class BootStrap {

    def init = { servletContext ->
    
        println "Creating base Roles and Users configuration" 
        def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true, failOnError: true) 
        
        def testUser = new User(username: 'glosej', password: 'password', enabled: true).save(flush: true, failOnError: true) 
        
        UserRole.create testUser, adminRole
        
        // if (!user.authorities.contains('ROLE_ADMIN')) { 
            // UserRole.create user, roleIn 
        // } 

        
    }
    def destroy = {
    }
}
