import android.support.v4.app.FragmentActivity;
import com.facebook.*;
import com.facebook.widget.*;

public class MainActivity extends FragmentActivity 
	{
    CallbackManager callbackManager;
    
    @Override
    public void onCreate(Bundle savedInstanceState) 
    	{
        super.onCreate(savedInstanceState);
        callbackManager = CallbackManager.Factory.create();
        LoginButton loginButton = (LoginButton) view.findViewById(R.id.usersettings_fragment_login_button);
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() { ... });
    	}
    
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) 
	{
	View view = inflater.inflate(R.layout.splash, container, false);

	loginButton = (LoginButton) view.findViewById(R.id.login_button);
	loginButton.setReadPermissions("email");
	// If using in a fragment
	loginButton.setFragment(this);    
	// Other app specific specialization

	// Callback registration
	loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>(){
	@Override
	public void onSuccess(LoginResult loginResult) 
		{
	    // App code
		}

	@Override
	public void onCancel() 
		{
	    // App code
		}

	@Override
	public void onError(FacebookException exception)
		{
	    // App code
		}});
    
	}
    
    public void onCreate(Bundle savedInstanceState) 
    	{
        super.onCreate(savedInstanceState);

        callbackManager = CallbackManager.Factory.create();

        LoginManager.getInstance().registerCallback(callbackManager,
                new FacebookCallback<LoginResult>() {
                    @Override
                    public void onSuccess(LoginResult loginResult) 
                    	{
                        // App code
                    	}

                    @Override
                    public void onCancel() 
                    	{
                         // App code
                    	}

                    @Override
                    public void onError(FacebookException exception) 
                    	{
                         // App code   
                    	}
                		});
    }
	
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) 
    	{
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    	}
    
    public void onCreate(Bundle savedInstanceState) 
    	{
        super.onCreate(savedInstanceState);
        callbackManager = CallbackManager.Factory.create();
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() { });
    	}
    
	}
