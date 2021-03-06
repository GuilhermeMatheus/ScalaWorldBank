package console

import queries._
import impl.queries._

object Application extends App {

  println("""WorldBank! 
            |Digite uma query:""".stripMargin)
  val query = QueryBuilder.getQuery("br;us : NY.GDP.MKTP.CD")
  val queryResult = new WorldBankQueryResolver().Resolve(query)
  queryResult show
}

