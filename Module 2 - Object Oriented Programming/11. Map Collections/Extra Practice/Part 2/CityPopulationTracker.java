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
    City city = this.cityPopulations.get(newCity);
    City copy = new City(city.getName(), city.getCountry(), city.getPopulation());
    this.cityPopulations.put(city.getName(), copy);
  }

}
