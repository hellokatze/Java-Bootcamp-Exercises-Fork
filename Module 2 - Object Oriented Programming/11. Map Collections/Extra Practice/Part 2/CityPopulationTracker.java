import java.util.HashMap;

public class CityPopulationTracker {

  private HashMap<String, City> cityPopulations;

  public CityPopulationTracker() {
    this.cityPopulations = new HashMap<>();
  }

  public City getCity(String cityName) {
    //City city = this.cityPopulations.get(cityName); this is already the object, no need to write new constructor.
    // return new City(city.getName(), city.getCountry(), city.getPopulation());
    return new City(this.cityPopulations.get(cityName))
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
