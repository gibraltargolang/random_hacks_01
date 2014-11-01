package controllers

import play.api.libs.json._
import play.api.mvc._

object Application extends Controller {

  case class Messages(message: String)

  implicit val placesWrites = Json.writes[Messages]

  def hello = Action {
    val json = Json.toJson(Messages("Hello, World!"))
    Ok(json).withHeaders(CONTENT_TYPE -> "application/json")
  }

  // http://localhost:9000/echo?action=sayHello
  def echo = Action {
    implicit request =>
      request.queryString.get("action").flatMap(_.headOption).getOrElse("invalid") match {
        case "sayHello" => sayHelloMethod
        case _ => BadRequest("Action not allowed!")
      }
//      Ok("echo - service")
  }

  // http://localhost:9000/echo?action=sayHello&msg=echo
  def sayHelloMethod(implicit request: RequestHeader) = {
    val msg = request.queryString.get("msg").flatMap(_.headOption).getOrElse("")
    Ok("Hello " + msg)
  }

  def index = Action {
    Ok(views.html.main())
  }
}