package HeadFirst.proxy.dating;

public interface Person {
  String getName();
  String getGender();
  String GetInterest();
  int getGeekRating();

  void setName(String name);
  void setGender(String gender);
  void setInterest(String interest);
  void setGeekRating(int rating);
}
