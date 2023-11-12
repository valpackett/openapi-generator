/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.1.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "ChildWithNullable.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <algorithm>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

ChildWithNullable::ChildWithNullable(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ChildWithNullable::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ChildWithNullable::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ChildWithNullable::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("type", m_Type);
	pt.put("nullableProperty", m_NullableProperty);
	pt.put("otherProperty", m_OtherProperty);
	return pt;
}

void ChildWithNullable::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	setType(pt.get("type", ""));
	m_NullableProperty = pt.get("nullableProperty", "");
	m_OtherProperty = pt.get("otherProperty", "");
}

std::string ChildWithNullable::getType() const
{
    return m_Type;
}

void ChildWithNullable::setType(std::string value)
{
    static const std::array<std::string, 1> allowedValues = {
        "ChildWithNullable"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Type = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


std::string ChildWithNullable::getNullableProperty() const
{
    return m_NullableProperty;
}

void ChildWithNullable::setNullableProperty(std::string value)
{
    m_NullableProperty = value;
}


std::string ChildWithNullable::getOtherProperty() const
{
    return m_OtherProperty;
}

void ChildWithNullable::setOtherProperty(std::string value)
{
    m_OtherProperty = value;
}



std::vector<ChildWithNullable> createChildWithNullableVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ChildWithNullable>();
    for (const auto& child: pt) {
        vec.emplace_back(ChildWithNullable(child.second));
    }

    return vec;
}

}
}
}
}
