/**
 */
package realtimestatechart.xdsml.xrtsc.realtimestatechart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realtimestatechart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link realtimestatechart.xdsml.xrtsc.realtimestatechart.Realtimestatechart#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link realtimestatechart.xdsml.xrtsc.realtimestatechart.Realtimestatechart#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartPackage#getRealtimestatechart()
 * @model
 * @generated
 */
public interface Realtimestatechart extends Behavior, NamedElement {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartPackage#getRealtimestatechart_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link realtimestatechart.xdsml.xrtsc.realtimestatechart.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartPackage#getRealtimestatechart_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 * @generated
	 */
	void initialize(EList<String> args);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void step();

} // Realtimestatechart
