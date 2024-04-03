//> using scala "3.3.1"
//> using lib "com.lihaoyi::cask:0.8.3"
//> using lib "com.lihaoyi::scalatags:0.12.0"
/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */


// this is generated from apiRoutes.mustache
package demo.rest.server.api

import mo.del.pack.age.*

import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

import java.time.OffsetDateTime
import mo.del.pack.age.User

class UserRoutes(service : UserService) extends cask.Routes {

    // route group for routeWorkAroundForGETUser
    @cask.get("/user", true)
    def routeWorkAroundForGETUser(request: cask.Request,username : Option[String] = None,password : Option[String] = None) = {
        request.remainingPathSegments match {
            case Seq("login") => loginUser(request,username.getOrElse(""), password.getOrElse(""))
            case Seq("logout") => logoutUser(request)
            case Seq(username) => getUserByName(username,request)
            case _          => cask.Response("Not Found", statusCode = 404)
        }
    }

        /** Create user
         * 
         */
        @cask.post("/user")
        def createUser(request: cask.Request) = {
            // auth method api_key : apiKey, keyParamName: api_key

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
              userData <- Parsed.eval(UserData.fromJsonString(request.bodyAsString)).mapError(e => s"Error parsing json as User from >${request.bodyAsString}< : ${e}") /* not array or map */
              user <- Parsed.fromTry(userData.validated(failFast))
            result <- Parsed.eval(service.createUser(user))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
            case Right(_) => cask.Response("", 200)
        }
      }
        /** Creates list of users with given input array
         * 
         */
        @cask.post("/user/createWithArray")
        def createUsersWithArrayInput(request: cask.Request) = {
            // auth method api_key : apiKey, keyParamName: api_key

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            user <- Parsed.fromTry(UserData.manyFromJsonStringValidated(request.bodyAsString)).mapError(e => s"Error parsing json as an array of User from >${request.bodyAsString}< : ${e}") /* array */
            result <- Parsed.eval(service.createUsersWithArrayInput(user))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
            case Right(_) => cask.Response("", 200)
        }
      }
        /** Creates list of users with given input array
         * 
         */
        @cask.post("/user/createWithList")
        def createUsersWithListInput(request: cask.Request) = {
            // auth method api_key : apiKey, keyParamName: api_key

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            user <- Parsed.fromTry(UserData.manyFromJsonStringValidated(request.bodyAsString)).mapError(e => s"Error parsing json as an array of User from >${request.bodyAsString}< : ${e}") /* array */
            result <- Parsed.eval(service.createUsersWithListInput(user))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
            case Right(_) => cask.Response("", 200)
        }
      }
        /** Delete user
         * 
         */
        @cask.delete("/user/:username")
        def deleteUser(username : String, request: cask.Request) = {
            // auth method api_key : apiKey, keyParamName: api_key

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            username <- Parsed(username)
            result <- Parsed.eval(service.deleteUser(username))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
            case Right(_) => cask.Response("", 200)
        }
      }
        /** Get user by user name
         * 
         */
        // conflicts with [/user/{username}, /user/login, /user/logout] after/user, ignoring @cask.get("/user/:username")
        def getUserByName(username : String, request: cask.Request) = {

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            username <- Parsed(username)
            result <- Parsed.eval(service.getUserByName(username))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
            case Right(_) => cask.Response("", 200)
        }
      }
        /** Logs user into the system
         * 
         */
        // conflicts with [/user/{username}, /user/login, /user/logout] after/user, ignoring @cask.get("/user/login")
        def loginUser(request: cask.Request, username : String, password : String) = {

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            result <- Parsed.eval(service.loginUser(username, password))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
            case Right(_) => cask.Response("", 200)
        }
      }
        /** Logs out current logged in user session
         * 
         */
        // conflicts with [/user/{username}, /user/login, /user/logout] after/user, ignoring @cask.get("/user/logout")
        def logoutUser(request: cask.Request) = {
            // auth method api_key : apiKey, keyParamName: api_key

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            result <- Parsed.eval(service.logoutUser())
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
            case Right(_) => cask.Response("", 200)
        }
      }
        /** Updated user
         * 
         */
        @cask.put("/user/:username")
        def updateUser(username : String, request: cask.Request) = {
            // auth method api_key : apiKey, keyParamName: api_key

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            username <- Parsed(username)
              userData <- Parsed.eval(UserData.fromJsonString(request.bodyAsString)).mapError(e => s"Error parsing json as User from >${request.bodyAsString}< : ${e}") /* not array or map */
              user <- Parsed.fromTry(userData.validated(failFast))
            result <- Parsed.eval(service.updateUser(username, user))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
            case Right(_) => cask.Response("", 200)
        }
      }

    initialize()
}
