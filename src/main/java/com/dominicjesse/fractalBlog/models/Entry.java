package com.dominicjesse.fractalBlog.models;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import com.dominicjesse.fractalBlog.enums.EntryVisibility;


@Node
public class Entry {

  @Id @GeneratedValue private Long elementId;

  private String text;
  private User creator;
  private EntryVisibility visibility;
  private ZonedDateTime datetimeCreated;
  
  @SuppressWarnings("unused")
  private Entry() {
    // Empty constructor required as of Neo4j API 2.0.5
  };

  public Entry(String text, User creator, EntryVisibility visibility) {
    this.text = text;
    this.creator = creator;
    this.visibility = visibility;
    ZoneId zoneId = ZoneId.of("America/Chicago");
    this.datetimeCreated = ZonedDateTime.now(zoneId);
  }

  /**
   * Neo4j doesn't REALLY have bi-directional relationships. It just means when querying
   * to ignore the direction of the relationship.
   * https://dzone.com/articles/modelling-data-neo4j
   */
  @Relationship(type = "HAS_PREVIOUS_ENTRY")
  public Entry previousEntry;
  @Relationship(type = "HAS_NEXT_ENTRY")
  public Entry nextEntry;

  public void addEntryInOrder(Entry last) {
    last.nextEntry = this;
    this.previousEntry = last;
  }
  public String getText() {
    return text;
  }
  public void updateText(String txt) {
    this.text = txt;
  }
  
  public String toString() {
	    return this.creator.toString() + ", entry created => " + this.datetimeCreated;
  }
  
}
