package io.github.bananapuncher714.cartographer.core.api;

import java.util.UUID;

import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.map.MapCursor;
import org.bukkit.map.MapCursor.Type;

import io.github.bananapuncher714.cartographer.core.map.palette.MinimapPalette;

public interface PacketHandler {
	Object onPacketInterceptOut( Player player, Object packet );
	Object onPacketInterceptIn( Player player, Object packet );
	boolean isMapRegistered( int id );
	void unregisterMap( int id );
	void registerMap( int id );
	void sendDataTo( int id, byte[] data, MapCursor[] cursors, UUID... uuids );
	MinimapPalette getVanillaPalette();
	
	default boolean mapBug() {
		return false;
	}
	
	// More mundane methods
	MapCursor constructMapCursor( int x, int y, double yaw, Type cursorType, String name );
	
	double getTPS();
	boolean registerCommand( String fallbackPrefix, PluginCommand command );
	boolean registerCommand( PluginCommand command );
	
	GeneralUtil getUtil();
}
