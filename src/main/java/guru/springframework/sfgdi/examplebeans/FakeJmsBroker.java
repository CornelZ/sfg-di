package guru.springframework.sfgdi.examplebeans;

public class FakeJmsBroker {
  private String username;
  private String password;
  private String url;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("FakeJmsBroker [username=")
        .append(username)
        .append(", password=")
        .append(password)
        .append(", url=")
        .append(url)
        .append("]");
    return builder.toString();
  }
}
