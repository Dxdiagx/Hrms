package kodlamaio.hrms.Adapters.cloudinary;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;

public class CloudinaryUserConfig {
    @Bean(name = {"getCloudinaryUser", "Cloudinary"})
    public Cloudinary getCloudinaryUser(){
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "samet12345678",
                "api_key", "175211481285996",
                "api_secret", "whVbQLQ3677Tl8W88MDgpva1j7A"));
    }
}
