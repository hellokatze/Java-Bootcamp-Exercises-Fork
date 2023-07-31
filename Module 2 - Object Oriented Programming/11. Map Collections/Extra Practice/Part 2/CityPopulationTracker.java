import java.util.HashMap;

public class CityPopulationTracker {

  private HashMap<String, City> cityPopulations;

  public CityPopulationTracker() {
    this.cityPopulations = new HashMap<>();
  }

  public City getCity(String cityName) {
    City city = this.cityPopulations.get(cityName);
    return new City(city.getName(), city.getCountry(), city.getPopulation());
  }

  public void setCity(City newCity) {
    City copy = new City(newCity.getName(), newCity.getCountry(), newCity.getPopulation());
    if (this.cityPopulations.containsKey(newCity.getName())) {
      this.cityPopulations.put(newCity.getName(), copy);
    } else {
      addCity(copy);
    }
  }

  public void addCity(City newCity) {
    City copy = new City(newCity.getName(), newCity.getCountry(), newCity.getPopulation());
    this.cityPopulations.put(copy.getName(), copy);
  }
}
