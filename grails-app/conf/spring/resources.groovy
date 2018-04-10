import com.yourapp.PersonPasswordEncoderListener
import com.yourapp.PersonPasswordEncoderListener
// Place your Spring DSL code here
beans = {
    personPasswordEncoderListener(PersonPasswordEncoderListener, ref('hibernateDatastore'))
    personPasswordEncoderListener(PersonPasswordEncoderListener, ref('hibernateDatastore'))
}
