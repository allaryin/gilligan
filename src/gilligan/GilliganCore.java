package gilligan;

import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(name="Gilligan", version=Version.VERSION, modid = "Gilligan|Core", dependencies="required-after:Forge@[6.4.0.0,)")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)	// TODO: add channels & packet handler
public class GilliganCore {
	@Instance("Gilligan|Core")
	public static GilliganCore instance;
	
	public static Logger log = Logger.getLogger("Gilligan");
	
	@PreInit
	public void preInit(FMLPreInitializationEvent e) {
		log.setParent(FMLLog.getLogger());
		log.info("Gilligan's NetherMod - v"+Version.VERSION);
		// TODO: load configuration
	}
	
	@Init
	public void init(FMLInitializationEvent e) {
		// TODO: register things
		// TODO: init localization
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent e) {
	}
	
	@ServerStarting
	public void serverStarting(FMLServerStartingEvent e) {
	}
}
