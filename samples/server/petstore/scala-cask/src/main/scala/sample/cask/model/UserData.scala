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

// this model was generated using modelData.mustache
package sample.cask.model
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** UserData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class UserData(
  id: Long = 0 ,

    username: String = "" ,

    firstName: String = "" ,

    lastName: String = "" ,

    email: String = "" ,

    password: String = "" ,

    phone: String = "" ,

  /* User Status */
  userStatus: Int = 0 

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // id






        







        

        // ==================
        // username






        







        

        // ==================
        // firstName






        







        

        // ==================
        // lastName






        







        

        // ==================
        // email






        







        

        // ==================
        // password






        







        

        // ==================
        // phone






        







        

        // ==================
        // userStatus






        







        

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[User] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : User = {
    User(
        id = Option(
        id
        )
        ,
        username = Option(
        username
        )
        ,
        firstName = Option(
        firstName
        )
        ,
        lastName = Option(
        lastName
        )
        ,
        email = Option(
        email
        )
        ,
        password = Option(
        password
        )
        ,
        phone = Option(
        phone
        )
        ,
        userStatus = Option(
        userStatus
        )
        
    )
  }
}

object UserData {

  given readWriter : RW[UserData] = macroRW

  def fromJsonString(jason : String) : UserData = try {
        read[UserData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[UserData] = try {
        read[List[UserData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[User]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[User]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, UserData] = try {
        read[Map[String, UserData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, User]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, User]())) {
         case (Success(map), (key, next)) =>
           next.validated(failFast) match {
             case Success(ok) => Success(map.updated(key, ok))
             case Failure(err) => Failure(new Exception(s"Validation error on element $key: ${err.getMessage}", err))
           }
         case (fail, _) => fail
       }
     }
  }
}

