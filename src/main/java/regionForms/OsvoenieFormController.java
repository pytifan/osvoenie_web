/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regionForms;

import java.util.Date;
import org.jodreports.web.samples.Recipient;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author alex
 */
public class OsvoenieFormController extends SimpleFormController{
     public OsvoenieFormController() {
    setCommandClass(MyRecipient.class);
  }

  protected ModelAndView onSubmit(Object command) throws Exception {
    MyRecipient recipient = (MyRecipient) command;
    ModelAndView modelAndView = new ModelAndView(getSuccessView(), "recipient", recipient);
    modelAndView.addObject("date", new Date());
    return modelAndView;
  }    
}
