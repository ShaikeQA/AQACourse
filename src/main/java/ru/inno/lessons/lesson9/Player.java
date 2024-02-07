package ru.inno.lessons.lesson9;

import java.util.Objects;

public class Player {

    private int id;
    private String nickname;
    private Boolean isOnline;

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && Objects.equals(nickname, player.nickname) && Objects.equals(isOnline, player.isOnline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, isOnline);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

    public Player(int id, String nickname, Boolean isOnline) {
        this.id = id;
        this.nickname = nickname;
        this.isOnline = isOnline;
    }
}
