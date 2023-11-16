/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// NotificationtestGetElementsV1ResponseMPayload
    /// </summary>
    [DataContract(Name = "notificationtest-getElements-v1-Response-mPayload")]
    public partial class NotificationtestGetElementsV1ResponseMPayload : IEquatable<NotificationtestGetElementsV1ResponseMPayload>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NotificationtestGetElementsV1ResponseMPayload" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected NotificationtestGetElementsV1ResponseMPayload()
        {
            AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="NotificationtestGetElementsV1ResponseMPayload" /> class.
        /// </summary>
        /// <param name="pkiNotificationtestID">pkiNotificationtestID (required).</param>
        /// <param name="aObjVariableobject">aObjVariableobject (required).</param>
        public NotificationtestGetElementsV1ResponseMPayload(int pkiNotificationtestID = default(int), List<Dictionary<string, Object>> aObjVariableobject = default(List<Dictionary<string, Object>>))
        {
            _PkiNotificationtestID = pkiNotificationtestID;
            // to ensure "aObjVariableobject" is required (not null)
            if (aObjVariableobject == null)
            {
                throw new ArgumentNullException("aObjVariableobject is a required property for NotificationtestGetElementsV1ResponseMPayload and cannot be null");
            }
            _AObjVariableobject = aObjVariableobject;
            AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets PkiNotificationtestID
        /// </summary>
        [DataMember(Name = "pkiNotificationtestID", IsRequired = true, EmitDefaultValue = true)]
        public int PkiNotificationtestID
        {
            get{ return _PkiNotificationtestID;}
            set
            {
                _PkiNotificationtestID = value;
                _flagPkiNotificationtestID = true;
            }
        }
        private int _PkiNotificationtestID;
        private bool _flagPkiNotificationtestID;

        /// <summary>
        /// Returns false as PkiNotificationtestID should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializePkiNotificationtestID()
        {
            return _flagPkiNotificationtestID;
        }
        /// <summary>
        /// Gets or Sets AObjVariableobject
        /// </summary>
        [DataMember(Name = "a_objVariableobject", IsRequired = true, EmitDefaultValue = true)]
        public List<Dictionary<string, Object>> AObjVariableobject
        {
            get{ return _AObjVariableobject;}
            set
            {
                _AObjVariableobject = value;
                _flagAObjVariableobject = true;
            }
        }
        private List<Dictionary<string, Object>> _AObjVariableobject;
        private bool _flagAObjVariableobject;

        /// <summary>
        /// Returns false as AObjVariableobject should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeAObjVariableobject()
        {
            return _flagAObjVariableobject;
        }
        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NotificationtestGetElementsV1ResponseMPayload {\n");
            sb.Append("  PkiNotificationtestID: ").Append(PkiNotificationtestID).Append("\n");
            sb.Append("  AObjVariableobject: ").Append(AObjVariableobject).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input as NotificationtestGetElementsV1ResponseMPayload).AreEqual;
        }

        /// <summary>
        /// Returns true if NotificationtestGetElementsV1ResponseMPayload instances are equal
        /// </summary>
        /// <param name="input">Instance of NotificationtestGetElementsV1ResponseMPayload to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NotificationtestGetElementsV1ResponseMPayload input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input).AreEqual;
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = (hashCode * 59) + PkiNotificationtestID.GetHashCode();
				hashCode = (hashCode * 59) + AObjVariableobject.GetHashCode();
                if (AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
