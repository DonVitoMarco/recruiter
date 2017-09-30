package pl.thewalkingcode.security;

import org.apache.shiro.SecurityUtils;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name = "LogoutBean")
public class LogoutBean {

    public void submit() {
        SecurityUtils.getSubject().logout();
    }

}
