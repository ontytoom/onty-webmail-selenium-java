package com.ontytoom.webmail.seleniumTest.utils;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by onTy on 2017-02-11.
 */
public class Config
{

	public static String baseUrl = "https://onty-webmail-ruby.herokuapp.com/";
	public static double thinktimeS = 1.0;
	public static double timeoutS = 60.0;
	public static String instanceName = "default_instance_name";
	public static String firefoxDriverPath = "C:/dvt/Selenium/WebDrivers/geckodriver.exe";

	private static boolean isInitialized = false;
	private static final Object sync = new Object();


	public static void init()
	{
		if ( isInitialized )
			return;

		synchronized ( sync )
		{
			if ( isInitialized )
				return;

			Properties prop = new Properties();

			try
			{
				FileInputStream fis = new FileInputStream( "config.xml" );
				prop.loadFromXML( fis );

				if ( prop.containsKey( "baseUrl" ) )
					baseUrl = prop.getProperty( "baseUrl" );

				if ( prop.containsKey( "thinktimeS" ) )
					thinktimeS = Double.parseDouble( prop.getProperty( "thinktimeS" ) );

				if ( prop.containsKey( "timeoutS" ) )
					timeoutS = Double.parseDouble( prop.getProperty( "timeoutS" ) );

				if ( prop.containsKey( "instanceName" ) )
					instanceName = prop.getProperty( "instanceName" );

				if ( prop.containsKey( "firefoxDriverPath" ) )
					firefoxDriverPath = prop.getProperty( "firefoxDriverPath" );

			}
			catch ( Exception ex )
			{
				ex.printStackTrace();
				System.err.println( "Count not read the config.xml file." );
			}

			TestData.init();

			isInitialized = true;
		}

	}

}
