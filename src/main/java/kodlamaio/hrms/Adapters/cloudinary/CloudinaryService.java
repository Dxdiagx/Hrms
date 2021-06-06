package kodlamaio.hrms.Adapters.cloudinary;
import kodlamaio.hrms.core.utilities.results.DataResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public interface CloudinaryService {
    DataResult<Map> upload(MultipartFile multipartFile) throws IOException;
}
