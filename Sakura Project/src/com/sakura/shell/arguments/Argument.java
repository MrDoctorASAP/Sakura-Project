package com.sakura.shell.arguments;

public class Argument {
	
	private Tag tag;
	
	private Value value;
	
	public Argument(String tag, String value) {
		this.value = new Value(value);
		this.tag = new Tag(tag);
	}
	
	public Tag getTag() {
		return tag;
	}
	
	public Value getValue() {
		return value;
	}
	
	public Type getType() {
		if(value.isAvailable()) {
			if(tag.isAvailable()) {
				return Type.TagAndValue;
			} else {
				return Type.OnlyValue;
			}
		} else {
			return Type.OnlyTag;
		}
	}
	
	public enum Type{
		TagAndValue,
		OnlyTag,
		OnlyValue
	}
	
}
