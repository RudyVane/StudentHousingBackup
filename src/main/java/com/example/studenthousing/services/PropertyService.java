package com.example.studenthousing.services;

import java.util.List;
import java.util.Optional;
import com.example.studenthousing.model.Property;
import com.example.studenthousing.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;

    public Property newProperty(String externalId, int areaSqm, String city, String coverImageUrl, String furnish, String latitude, String longitude, String postalCode, String propertyType, String rawAvailability, int rent, String rentDetail, String title, int additionalCosts, int deposit, String descriptionNonTranslated, String descriptionTranslated, String energyLabel, String gender, String internet, String isRoomActive, String kitchen, String living, String matchAge, String matchCapacity, String matchGender, String matchLanguages, String matchStatus, String pageDescription, String pageTitle, String pets, int registrationCost, String roommates, String shower, String smokingInside, String toilet) {
        Property p = new Property();
        p.setExternalId(externalId);
        p.setAreaSqm(areaSqm);
        p.setCity(city);
        p.setCoverImageUrl(coverImageUrl);
        p.setFurnish(furnish);
        p.setLatitude(latitude);
        p.setLongitude(longitude);
        p.setPostalCode(postalCode);
        p.setPropertyType(propertyType);
        p.setRawAvailability(rawAvailability);
        p.setRent(rent);
        p.setRentDetail(rentDetail);
        p.setTitle(title);
        p.setAdditionalCosts(additionalCosts);
        p.setDeposit(deposit);
        p.setDescriptionNonTranslated(descriptionNonTranslated);
        p.setDescriptionTranslated(descriptionTranslated);
        p.setEnergyLabel(energyLabel);
        p.setGender(gender);
        p.setInternet(internet);
        p.setIsRoomActive(isRoomActive);
        p.setKitchen(kitchen);
        p.setLiving(living);
        p.setMatchAge(matchAge);
        p.setMatchCapacity(matchCapacity);
        p.setMatchGender(matchGender);
        p.setMatchLanguages(matchLanguages);
        p.setMatchStatus(matchStatus);
        p.setPageDescription(pageDescription);
        p.setPageTitle(pageTitle);
        p.setPets(pets);
        p.setRegistrationCost(registrationCost);
        p.setRoommates(roommates);
        p.setShower(shower);
        p.setSmokingInside(smokingInside);
        p.setToilet(toilet);

        return propertyRepository.save(p);
    }


    public void test() {
        // Save a new Property
        Property newProperty = new Property();
        newProperty.setExternalId("Room-123");

        propertyRepository.save(newProperty);




        // Find a Property by PropertyName
//        System.out.println("\nFind Property by name (JPA-Property1)...");
//        List<Property> properties = propertyRepository.findByPropertyName("JPA-Property1");
//        properties.forEach(property -> System.out.println(property));

        // List all Properties
        // System.out.println("\nListing all Properties...");
        Iterable<Property> iterator = propertyRepository.findAll();
        //iterator.forEach(property -> System.out.println(property));

        // Count number of Properties
        long count = propertyRepository.count();
        System.out.println("Number of Properties: " + count);
    }
    public List<Property> getProperties() {
        return propertyRepository.findFirst10Properties();
    }
  /*  public Object getPropertyById(int id) {
        return propertyRepository.findById(id);
    }*/

    public Object getAllProperties() {
        return propertyRepository.findAll();
    }
}
