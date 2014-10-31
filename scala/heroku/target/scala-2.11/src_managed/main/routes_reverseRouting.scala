// @SOURCE:/home/ipapp/workspace/sandbox/play-rest/conf/routes
// @HASH:c6beeeae76341ced2647f80cc49e168cba71926c
// @DATE:Thu Oct 30 15:54:24 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:11
class ReverseAssets {


// @LINE:11
def versioned(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def hello(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "hello")
}
                        

// @LINE:8
def echo(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "echo")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:11
class ReverseAssets {


// @LINE:11
def versioned : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.versioned",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def hello : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.hello",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hello"})
      }
   """
)
                        

// @LINE:8
def echo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.echo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "echo"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:11
class ReverseAssets {


// @LINE:11
def versioned(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.versioned(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def hello(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.hello(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "hello", Seq(), "GET", """""", _prefix + """hello""")
)
                      

// @LINE:8
def echo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.echo(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "echo", Seq(), "GET", """""", _prefix + """echo""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    