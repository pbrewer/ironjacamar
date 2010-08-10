/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.jca.common.api.metadata.ds;

import org.jboss.jca.common.api.metadata.JCAMetadata;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * A DataSource.
 *
 * @author <a href="stefano.maestri@jboss.com">Stefano Maestri</a>
 *
 */
public interface DataSource extends JCAMetadata
{

   /**
    * Get the minPoolSize.
    *
    * @return the minPoolSize.
    */
   public Integer getMinPoolSize();

   /**
    * Get the maxPoolSize.
    *
    * @return the maxPoolSize.
    */
   public Integer getMaxPoolSize();

   /**
    * Get the prefill.
    *
    * @return the prefill.
    */
   public boolean isPrefill();

   /**
    * Get the userName.
    *
    * @return the userName.
    */
   public String getUserName();

   /**
    * Get the password.
    *
    * @return the password.
    */
   public String getPassword();

   /**
    * Get the connectionUrl.
    *
    * @return the connectionUrl.
    */
   public String getConnectionUrl();

   /**
    * Get the driverClass.
    *
    * @return the driverClass.
    */
   public String getDriverClass();

   /**
    * Get the transactionIsolation.
    *
    * @return the transactionIsolation.
    */
   public TransactionIsolation getTransactionIsolation();

   /**
    * Get the connectionProperties.
    *
    * @return the connectionProperties.
    */
   public Map<String, String> getConnectionProperties();

   /**
    * Get the timeOutSettings.
    *
    * @return the timeOutSettings.
    */
   public TimeOutSettings getTimeOutSettings();

   /**
    * Get the securitySettings.
    *
    * @return the securitySettings.
    */
   public SecuritySettings getSecuritySettings();

   /**
    * Get the statementSettings.
    *
    * @return the statementSettings.
    */
   public StatementSettings getStatementSettings();

   /**
    * Get the validationSettings.
    *
    * @return the validationSettings.
    */
   public ValidationSettings getValidationSettings();

   /**
    * Get the urlDelimiter.
    *
    * @return the urlDelimiter.
    */
   public String getUrlDelimiter();

   /**
    * Get the urlSelectorStrategyClassName.
    *
    * @return the urlSelectorStrategyClassName.
    */
   public String getUrlSelectorStrategyClassName();

   /**
    * Get the newConnectionSql.
    *
    * @return the newConnectionSql.
    */
   public String getNewConnectionSql();

   /**
    * Get the useJavaContext.
    *
    * @return the useJavaContext.
    */
   public boolean isUseJavaContext();

   /**
    * Get the poolName.
    *
    * @return the poolName.
    */
   public String getPoolName();

   /**
    * Get the enabled.
    *
    * @return the enabled.
    */
   public boolean isEnabled();

   /**
    * Get the jndiName.
    *
    * @return the jndiName.
    */
   public String getJndiName();

   /**
   *
   * A Tag.
   *
   * @author <a href="stefano.maestri@jboss.com">Stefano Maestri</a>
   *
   */
   public enum Tag
   {
      /** always first
       *
       */
      UNKNOWN(null),

      /**
       * min-pool-size tag
       */
      MIN_POOL_SIZE("min-pool-size"),

      /**
      * maxPoolSize tag
      */
      MAXPOOLSIZE("maxPoolSize"),
      /**
      * prefill tag
      */
      PREFILL("prefill"),
      /**
      * userName tag
      */
      USERNAME("userName"),
      /**
      * password tag
      */
      PASSWORD("password"),
      /**
      * connectionUrl tag
      */
      CONNECTIONURL("connectionUrl"),
      /**
      * driverClass tag
      */
      DRIVERCLASS("driverClass"),
      /**
      * transactionIsolation tag
      */
      TRANSACTIONISOLATION("transactionIsolation"),
      /**
      * connectionProperty tag
      */
      CONNECTIONPROPERTY("connectionProperty"),
      /**
      * timeOutSettings tag
      */
      TIMEOUTSETTINGS("timeOutSettings"),
      /**
      * securitySettings tag
      */
      SECURITYSETTINGS("securitySettings"),
      /**
      * statementSettings tag
      */
      STATEMENTSETTINGS("statementSettings"),
      /**
      * validationSettings tag
      */
      VALIDATIONSETTINGS("validationSettings"),
      /**
      * urlDelimiter tag
      */
      URLDELIMITER("urlDelimiter"),
      /**
      * urlSelectorStrategyClassName tag
      */
      URLSELECTORSTRATEGYCLASSNAME("urlSelectorStrategyClassName"),
      /**
      * newConnectionSql tag
      */
      NEWCONNECTIONSQL("newConnectionSql");

      private final String name;

      /**
       *
       * Create a new Tag.
       *
       * @param name a name
       */
      Tag(final String name)
      {
         this.name = name;
      }

      /**
       * Get the local name of this element.
       *
       * @return the local name
       */
      public String getLocalName()
      {
         return name;
      }

      private static final Map<String, Tag> MAP;

      static
      {
         final Map<String, Tag> map = new HashMap<String, Tag>();
         for (Tag element : values())
         {
            final String name = element.getLocalName();
            if (name != null)
               map.put(name, element);
         }
         MAP = map;
      }

      /**
      *
      * Static method to get enum instance given localName XsdString
      *
      * @param localName a XsdString used as localname (typically tag name as defined in xsd)
      * @return the enum instance
      */
      public static Tag forName(String localName)
      {
         final Tag element = MAP.get(localName);
         return element == null ? UNKNOWN : element;
      }

   }

   /**
    *
    * A Attribute.
    *
    * @author <a href="stefano.maestri@jboss.com">Stefano Maestri</a>
    *
    */
   public enum Attribute
   {

      /** jndiName attribute
       *
       */
      JNDINAME("jndiName"),

      /** jndiName attribute
      *
      */
      POOL_NAME("pool-name"),

      /** jndiName attribute
      *
      */
      ENABLED("enabled"),
      /** jndiName attribute
      *
      */
      USEJAVACONTEXT("useJavaContext");

      private final String name;

      /**
       *
       * Create a new Tag.
       *
       * @param name a name
       */
      Attribute(final String name)
      {
         this.name = name;
      }

      /**
       * Get the local name of this element.
       *
       * @return the local name
       */
      public String getLocalName()
      {
         return name;
      }

   }

}