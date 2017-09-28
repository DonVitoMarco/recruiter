package pl.thewalkingcode.utils;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name = "navigationBean", eager = true)
public class NavigationBean {

    public String goToPage(String page) {
        return page;
    }

}
