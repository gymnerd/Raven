package raven.math.graph;

import java.io.Reader;

import raven.math.Vector2D;
import raven.utils.StreamUtils;

public abstract class GraphNode {
	public static final int INVALID_NODE_INDEX = -1;
	
	protected Vector2D position;
	
	protected int index;
	
	public GraphNode() { index = INVALID_NODE_INDEX; }
	public GraphNode(int index) { this.index = index; }
	public GraphNode(Reader reader) {
		index = (Integer)StreamUtils.getValueFromStream(reader);
	}
	
	public Vector2D pos() { return position; }
	public void setPos(Vector2D newPosition) { position = newPosition; }

	public int index() { return index; }
	public void setIndex(int index) { this.index = index; }
	
	public String toString() { return "Index: " + index; }
}