// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = UseSourceGeneration.Client.ClientUtils;
using System.Text.Json.Serialization.Metadata;
using UseSourceGeneration.Client;

namespace UseSourceGeneration.Model
{
    /// <summary>
    /// BananaReq
    /// </summary>
    public partial class BananaReq : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BananaReq" /> class.
        /// </summary>
        /// <param name="lengthCm">lengthCm</param>
        /// <param name="sweet">sweet</param>
        [JsonConstructor]
        public BananaReq(decimal lengthCm, bool sweet)
        {
            LengthCm = lengthCm;
            Sweet = sweet;
            OnCreated();
        }

        partial void OnCreated();

        /// <summary>
        /// Gets or Sets LengthCm
        /// </summary>
        [JsonPropertyName("lengthCm")]
        public decimal LengthCm { get; set; }

        /// <summary>
        /// Gets or Sets Sweet
        /// </summary>
        [JsonPropertyName("sweet")]
        public bool Sweet { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BananaReq {\n");
            sb.Append("  LengthCm: ").Append(LengthCm).Append("\n");
            sb.Append("  Sweet: ").Append(Sweet).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="BananaReq" />
    /// </summary>
    public class BananaReqJsonConverter : JsonConverter<BananaReq>
    {
        /// <summary>
        /// Deserializes json to <see cref="BananaReq" />
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override BananaReq Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            decimal? lengthCm = default;
            bool? sweet = default;

            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string? localVarJsonPropertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (localVarJsonPropertyName)
                    {
                        case "lengthCm":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                lengthCm = utf8JsonReader.GetDecimal();
                            break;
                        case "sweet":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                sweet = utf8JsonReader.GetBoolean();
                            break;
                        default:
                            break;
                    }
                }
            }

            if (lengthCm == null)
                throw new ArgumentNullException(nameof(lengthCm), "Property is required for class BananaReq.");

            if (sweet == null)
                throw new ArgumentNullException(nameof(sweet), "Property is required for class BananaReq.");

            return new BananaReq(lengthCm.Value, sweet.Value);
        }

        /// <summary>
        /// Serializes a <see cref="BananaReq" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="bananaReq"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, BananaReq bananaReq, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteStartObject();

            WriteProperties(ref writer, bananaReq, jsonSerializerOptions);
            writer.WriteEndObject();
        }

        /// <summary>
        /// Serializes the properties of <see cref="BananaReq" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="bananaReq"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public void WriteProperties(ref Utf8JsonWriter writer, BananaReq bananaReq, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteNumber("lengthCm", bananaReq.LengthCm);
            writer.WriteBoolean("sweet", bananaReq.Sweet);
        }
    }

    /// <summary>
    /// The BananaReqSerializationContext
    /// </summary>
    [JsonSourceGenerationOptions(WriteIndented = true, GenerationMode = JsonSourceGenerationMode.Serialization)]
    [JsonSerializable(typeof(BananaReq))]
    public partial class BananaReqSerializationContext : JsonSerializerContext
    {
        /// <summary>
        /// The BananaReqSerializationContext
        /// </summary>
        /// <param name="optionsProvider"></param>
        public BananaReqSerializationContext(JsonSerializerOptionsProvider optionsProvider): base(new(optionsProvider.Options))
        {
        }
    }

    /// <summary>
    /// BananaReqDeserializationContext
    /// </summary>
    [JsonSourceGenerationOptions(WriteIndented = true, GenerationMode = JsonSourceGenerationMode.Metadata)]
    [JsonSerializable(typeof(BananaReq))]
    public partial class BananaReqDeserializationContext : JsonSerializerContext
    {
        /// <summary>
        /// BananaReqDeserializationContext
        /// </summary>
        /// <param name="optionsProvider"></param>
        public BananaReqDeserializationContext(JsonSerializerOptionsProvider optionsProvider): base(new(optionsProvider.Options))
        {
        }
    }
}