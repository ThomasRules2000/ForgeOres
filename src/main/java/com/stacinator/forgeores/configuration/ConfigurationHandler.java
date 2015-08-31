package com.stacinator.forgeores.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);

        try
        {
            configuration.load();

            configuration.setCategoryComment("Ore Generation", "Enable Generation of Various Ores in the World");

            boolean copperEnabled = configuration.get("Ore Generation", "copperEnabled", true, "Enable Copper Ore Generation").getBoolean(true);
            boolean tinEnabled = configuration.get("Ore Generation", "tinEnabled", true, "Enable Tin Ore Generation").getBoolean(true);
            boolean silverEnabled = configuration.get("Ore Generation", "silverEnabled", true, "Enable Silver Ore Generation").getBoolean(true);
            boolean nickelEnabled = configuration.get("Ore Generation", "nickelEnabled", true, "Enable Nickel Ore Generation").getBoolean(true);
            boolean leadEnabled = configuration.get("Ore Generation", "leadEnabled", true, "Enable Lead Ore Generation").getBoolean(true);
            boolean aluminiumEnabled = configuration.get("Ore Generation", "aluminiumEnabled", true, "Enable Aluminium Ore Generation").getBoolean(true);

            boolean silverLeadTogether = configuration.get("Ore Generation", "silverLeadTogether", true, "Generate Silver and Lead Ores together in a single vein").getBoolean(true);

            /*boolean silverLeadApart = configuration.get("Ore Generation", "silverLeadApart", true, "Generate Seperate Veins of Silver and Lead Ores").getBoolean(true);

            if(!silverLeadTogether && !silverLeadApart)
            {
                silverLeadTogether = true;
            }
            */
        }
        catch (Exception e)
        {

        }
        finally
        {
            configuration.save();
        }
    }
}
