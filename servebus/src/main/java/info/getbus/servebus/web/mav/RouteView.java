package info.getbus.servebus.web.mav;

import info.getbus.servebus.model.route.CompactRoute;
import info.getbus.servebus.repository.CountriesRepository;
import info.getbus.servebus.web.dto.route.PeriodicityPairDTO;
import info.getbus.servebus.web.dto.route.RouteDTO;
import info.getbus.servebus.web.views.TransporterCabView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class RouteView extends TransporterCabView {
    private final CountriesRepository countriesRepository;

    @Autowired
    public RouteView(CountriesRepository countriesRepository) {
        this.countriesRepository = countriesRepository;
    }

    public ModelAndView periodicity(PeriodicityPairDTO periodicity) {
        addObject("periodicity", periodicity);
        return periodicity();
    }
    public ModelAndView periodicity() {
        return page("periodicity");
    }

    public ModelAndView list(List<CompactRoute> routes) {
        addObject("routes", routes);
        return list();
    }
    public ModelAndView list() {
        return page("list");
    }

    public ModelAndView edit(RouteDTO route) {
        addObject("viewMode", false);
        return route(route);

    }

    public ModelAndView view(RouteDTO route) {
        addObject("viewMode", true);
        return route(route);
    }

    private ModelAndView route(RouteDTO route) {
        addObject("countries", countriesRepository.getAll());
        addObject("route", route);
        return page("edit");
    }
}
