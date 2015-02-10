package controllers;

import play.*;
import play.mvc.*;
import play.data.format.*;
import views.html.*;
import views.html.helper.form;
import play.data.*;

public class Application extends Controller {

	public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

  public static Result login() {
	return ok(login.render(Form.form(Login.class)));
	  
    }
    public static class Login {

        public String email;
        public String password;

    }
    public static Result authenticate() {
        Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
        return ok();
    }
    
  
    
}
