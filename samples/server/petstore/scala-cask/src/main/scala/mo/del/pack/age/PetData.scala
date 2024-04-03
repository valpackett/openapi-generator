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
package mo.del.pack.age
import mo.del.pack.age.Category
import mo.del.pack.age.Tag
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** PetData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class PetData(
  id: Long = 0 ,

    category: CategoryData = null ,

    name: String,

    photoUrls: Seq[String],

    tags: Seq[TagData] = Nil ,

  /* pet status in the store */
  status: Pet.StatusEnum = null 

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // id






        







        

        // ==================
        // category






        







        
        // validating category
        if (errors.isEmpty || !failFast) {
            if category != null then errors ++= category.validationErrors(path :+ Pet.Fields.category, failFast)
        }

        // ==================
        // name






        







        

        // ==================
        // photoUrls






        







        

        // ==================
        // tags






        







        
        if (errors.isEmpty || !failFast) {
            if (tags != null) {
                tags.zipWithIndex.foreach {
                    case (value, i) if errors.isEmpty || !failFast =>
                      errors ++= value.validationErrors(
                        path :+ Pet.Fields.tags :+ Field(i.toString),
                        failFast)
                    case (value, i) =>
                }
            }
        }
        

        // ==================
        // status






        







        

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[Pet] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : Pet = {
    Pet(
        id = Option(
        id
        )
        ,
        category = Option(
        category
        )
        .map(_.asModel),
        name = 
        name
        
        ,
        photoUrls = 
        photoUrls
        
        ,
        tags = 
        tags
        
        .map(_.asModel),
        status = Option(
        status
        )
        
    )
  }
}

object PetData {

  given readWriter : RW[PetData] = macroRW

  def fromJsonString(jason : String) : PetData = try {
        read[PetData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[PetData] = try {
        read[List[PetData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[Pet]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[Pet]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, PetData] = try {
        read[Map[String, PetData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, Pet]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, Pet]())) {
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

