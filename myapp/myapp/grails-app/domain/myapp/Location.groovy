package myapp

import grails.rest.Resource

@Resource(uri = '/locations')
class Locations {


    static constraints = {
    }
    static mapping = {
        autowire true
    }
    def LocationServiceImpl
    def getLocation(){
        def locations=LocationServiceImpl.getLocation(50)
        return locations
    }

}
