package net.kdt.novalaunch.authenticator.listener;

import net.kdt.novalaunch.value.MinecraftAccount;

/** Called when the login is done and the account received. guaranteed to be on the UI Thread */
public interface DoneListener {
    void onLoginDone(MinecraftAccount account);
}
