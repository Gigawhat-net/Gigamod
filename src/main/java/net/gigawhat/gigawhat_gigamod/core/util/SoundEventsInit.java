package net.gigawhat.gigawhat_gigamod.core.util;

import org.lwjgl.system.CallbackI.F;

import net.gigawhat.gigawhat_gigamod.Gigamod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundEventsInit 
{
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Gigamod.MOD_ID);

    // ------------------------- Mob Sounds ------------------------- :

    // public static final RegistryObject<SoundEvent> GIGALAND_PROTECTOR_DEATH = registerSoundEvent("gigaland_protector_death");
    // public static final RegistryObject<SoundEvent> GIGALAND_PROTECTOR_REPAIR = registerSoundEvent("gigaland_protector_repair");

    // ------------------------- Music ------------------------- :

    public static final RegistryObject<SoundEvent> DOCTOR_WHO_THEME_2005 = registerSoundEvent("doctor_who_theme_2005");
    public static final RegistryObject<SoundEvent> I_AM_THE_DOCTOR = registerSoundEvent("i_am_the_doctor");
    public static final RegistryObject<SoundEvent> THE_DARK_AND_ENDLESS_DALEK_NIGHT = registerSoundEvent("the_dark_and_endless_dalek_night");
    public static final RegistryObject<SoundEvent> GIGAWHAT_THEME = registerSoundEvent("gigawhat_theme");
    public static final RegistryObject<SoundEvent> IMPERIAL_MARCH = registerSoundEvent("imperial_march");
    public static final RegistryObject<SoundEvent> EREN_SAHIN_ERONAT_THEME = registerSoundEvent("eren_sahin_eronat_theme");
    public static final RegistryObject<SoundEvent> SERVER_WIDE_DOCTOR_WHO = registerSoundEvent("server_wide_doctor_who");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name)
    {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Gigamod.MOD_ID, name)));
    }

    public static void register(IEventBus bus)
    {
        SOUND_EVENTS.register(bus);
    }
}