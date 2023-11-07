package models;

public class UserSingleResponse {
    private UserResponse data;
    private Support support;

    public UserSingleResponse(UserResponse data, Support support) {
        this.data = data;
        this.support = support;
    }

    public UserResponse getData() {
        return data;
    }

    public void setData(UserResponse data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }
}
