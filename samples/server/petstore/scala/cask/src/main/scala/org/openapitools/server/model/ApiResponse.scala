/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@kindservices.co.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */

// this model was generated using model.mustache
package org.openapitools.server.model
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class ApiResponse(

  code: Int = 0 ,

  
  `type`: String = "" ,

  
  message: String = "" 

  ) {

  def asJson = write(this)

}

object ApiResponse{


  given RW[ApiResponse] = macroRW

  def fromJsonString(jason : String) : ApiResponse = try {
        read[ApiResponse](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : List[ApiResponse] = try {
        read[List[ApiResponse]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def mapFromJsonString(jason : String) : Map[String, ApiResponse] = try {
        read[Map[String, ApiResponse]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }

}

