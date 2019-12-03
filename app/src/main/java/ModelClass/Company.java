package ModelClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Company {

    @SerializedName("name")
    @Expose
    String name;

    @SerializedName("catchPhrase")
    @Expose
    String catchPhrase;

    @SerializedName("bs")
    @Expose
    String bs;
}
