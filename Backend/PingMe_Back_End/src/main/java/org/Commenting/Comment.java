package org.Commenting;


import jakarta.persistence.*;
import lombok.Data;


@Table(name = "Comments")
@Data

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private int id;

    @Column
    private String username;

    @Column
    private String content;

    @Column
    private String timestamp;


    //---------------------------------------------Constructors-----------------------------------------------------//

    public Comment() {
    }

    public Comment(int id, String username, String content, String timestamp) {
        this.id = id;
        this.username = username;
        this.content = content;
        this.timestamp = timestamp;
    }


    //---------------------------------------- Getters and Setters -----------------------------------------//
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
