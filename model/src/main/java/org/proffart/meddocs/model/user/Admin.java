package org.proffart.meddocs.model.user;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * team ProffArt
 * author Ashot Mnatsakanyan
 * date 1/15/16
 * time 4:53 PM
 */
@Entity
@DiscriminatorValue("ADMIN")
public class Admin extends User {
}
