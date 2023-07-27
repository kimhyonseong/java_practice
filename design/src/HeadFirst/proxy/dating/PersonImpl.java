package HeadFirst.proxy.dating;

import java.lang.reflect.Proxy;

public class PersonImpl implements Person{
  String name;
  String gender;
  String interest;
  int rating;
  int ratingCount = 0;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getGender() {
    return gender;
  }

  @Override
  public String GetInterest() {
    return interest;
  }

  @Override
  public int getGeekRating() {
    if (ratingCount == 0) return 0;
    return (rating/ratingCount);
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void setGender(String gender) {
    this.gender = gender;
  }

  @Override
  public void setInterest(String interest) {
    this.interest = interest;
  }

  @Override
  public void setGeekRating(int rating) {
    this.rating += rating;
    ratingCount++;
  }
}
