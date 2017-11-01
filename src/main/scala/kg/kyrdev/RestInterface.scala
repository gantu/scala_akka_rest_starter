package kg.kyrdev

import scala.concurrent.ExecutionContext

import akka.http.scaladsl.server.Route

import kg.kyrdev.resources.QuestionResource
import kg.kyrdev.services.QuestionService

trait RestInterface extends Resources {

  implicit def executionContext: ExecutionContext

  lazy val questionService = new QuestionService

  val routes: Route = questionRoutes

}

trait Resources extends QuestionResource