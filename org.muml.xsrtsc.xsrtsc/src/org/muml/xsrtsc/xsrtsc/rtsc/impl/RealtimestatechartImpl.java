/**
 */
package org.muml.xsrtsc.xsrtsc.rtsc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.xsrtsc.xsrtsc.rtsc.NamedElement;
import org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart;
import org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage;
import org.muml.xsrtsc.xsrtsc.rtsc.State;
import org.muml.xsrtsc.xsrtsc.rtsc.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realtimestatechart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl#getUnprocessedString <em>Unprocessed String</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl#getConsummedString <em>Consummed String</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl#getProducedString <em>Produced String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealtimestatechartImpl extends BehaviorImpl implements Realtimestatechart {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected State currentState;

	/**
	 * The default value of the '{@link #getUnprocessedString() <em>Unprocessed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnprocessedString()
	 * @generated
	 * @ordered
	 */
	protected static final String UNPROCESSED_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnprocessedString() <em>Unprocessed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnprocessedString()
	 * @generated
	 * @ordered
	 */
	protected String unprocessedString = UNPROCESSED_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsummedString() <em>Consummed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsummedString()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMMED_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsummedString() <em>Consummed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsummedString()
	 * @generated
	 * @ordered
	 */
	protected String consummedString = CONSUMMED_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getProducedString() <em>Produced String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedString()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCED_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProducedString() <em>Produced String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedString()
	 * @generated
	 * @ordered
	 */
	protected String producedString = PRODUCED_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealtimestatechartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscPackage.Literals.REALTIMESTATECHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.REALTIMESTATECHART__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, RtscPackage.REALTIMESTATECHART__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentWithInverseEList<State>(State.class, this, RtscPackage.REALTIMESTATECHART__STATES, RtscPackage.STATE__OWNING_RTSC);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (State)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtscPackage.REALTIMESTATECHART__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.REALTIMESTATECHART__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getCurrentState() {
		if (currentState != null && currentState.eIsProxy()) {
			InternalEObject oldCurrentState = (InternalEObject)currentState;
			currentState = (State)eResolveProxy(oldCurrentState);
			if (currentState != oldCurrentState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtscPackage.REALTIMESTATECHART__CURRENT_STATE, oldCurrentState, currentState));
			}
		}
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentState(State newCurrentState) {
		State oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.REALTIMESTATECHART__CURRENT_STATE, oldCurrentState, currentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnprocessedString() {
		return unprocessedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnprocessedString(String newUnprocessedString) {
		String oldUnprocessedString = unprocessedString;
		unprocessedString = newUnprocessedString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.REALTIMESTATECHART__UNPROCESSED_STRING, oldUnprocessedString, unprocessedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsummedString() {
		return consummedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsummedString(String newConsummedString) {
		String oldConsummedString = consummedString;
		consummedString = newConsummedString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.REALTIMESTATECHART__CONSUMMED_STRING, oldConsummedString, consummedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProducedString() {
		return producedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProducedString(String newProducedString) {
		String oldProducedString = producedString;
		producedString = newProducedString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.REALTIMESTATECHART__PRODUCED_STRING, oldProducedString, producedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializeModel(EList<String> args) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtscPackage.REALTIMESTATECHART__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtscPackage.REALTIMESTATECHART__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case RtscPackage.REALTIMESTATECHART__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtscPackage.REALTIMESTATECHART__NAME:
				return getName();
			case RtscPackage.REALTIMESTATECHART__TRANSITIONS:
				return getTransitions();
			case RtscPackage.REALTIMESTATECHART__STATES:
				return getStates();
			case RtscPackage.REALTIMESTATECHART__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case RtscPackage.REALTIMESTATECHART__CURRENT_STATE:
				if (resolve) return getCurrentState();
				return basicGetCurrentState();
			case RtscPackage.REALTIMESTATECHART__UNPROCESSED_STRING:
				return getUnprocessedString();
			case RtscPackage.REALTIMESTATECHART__CONSUMMED_STRING:
				return getConsummedString();
			case RtscPackage.REALTIMESTATECHART__PRODUCED_STRING:
				return getProducedString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RtscPackage.REALTIMESTATECHART__NAME:
				setName((String)newValue);
				return;
			case RtscPackage.REALTIMESTATECHART__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case RtscPackage.REALTIMESTATECHART__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case RtscPackage.REALTIMESTATECHART__INITIAL_STATE:
				setInitialState((State)newValue);
				return;
			case RtscPackage.REALTIMESTATECHART__CURRENT_STATE:
				setCurrentState((State)newValue);
				return;
			case RtscPackage.REALTIMESTATECHART__UNPROCESSED_STRING:
				setUnprocessedString((String)newValue);
				return;
			case RtscPackage.REALTIMESTATECHART__CONSUMMED_STRING:
				setConsummedString((String)newValue);
				return;
			case RtscPackage.REALTIMESTATECHART__PRODUCED_STRING:
				setProducedString((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RtscPackage.REALTIMESTATECHART__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RtscPackage.REALTIMESTATECHART__TRANSITIONS:
				getTransitions().clear();
				return;
			case RtscPackage.REALTIMESTATECHART__STATES:
				getStates().clear();
				return;
			case RtscPackage.REALTIMESTATECHART__INITIAL_STATE:
				setInitialState((State)null);
				return;
			case RtscPackage.REALTIMESTATECHART__CURRENT_STATE:
				setCurrentState((State)null);
				return;
			case RtscPackage.REALTIMESTATECHART__UNPROCESSED_STRING:
				setUnprocessedString(UNPROCESSED_STRING_EDEFAULT);
				return;
			case RtscPackage.REALTIMESTATECHART__CONSUMMED_STRING:
				setConsummedString(CONSUMMED_STRING_EDEFAULT);
				return;
			case RtscPackage.REALTIMESTATECHART__PRODUCED_STRING:
				setProducedString(PRODUCED_STRING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RtscPackage.REALTIMESTATECHART__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RtscPackage.REALTIMESTATECHART__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case RtscPackage.REALTIMESTATECHART__STATES:
				return states != null && !states.isEmpty();
			case RtscPackage.REALTIMESTATECHART__INITIAL_STATE:
				return initialState != null;
			case RtscPackage.REALTIMESTATECHART__CURRENT_STATE:
				return currentState != null;
			case RtscPackage.REALTIMESTATECHART__UNPROCESSED_STRING:
				return UNPROCESSED_STRING_EDEFAULT == null ? unprocessedString != null : !UNPROCESSED_STRING_EDEFAULT.equals(unprocessedString);
			case RtscPackage.REALTIMESTATECHART__CONSUMMED_STRING:
				return CONSUMMED_STRING_EDEFAULT == null ? consummedString != null : !CONSUMMED_STRING_EDEFAULT.equals(consummedString);
			case RtscPackage.REALTIMESTATECHART__PRODUCED_STRING:
				return PRODUCED_STRING_EDEFAULT == null ? producedString != null : !PRODUCED_STRING_EDEFAULT.equals(producedString);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case RtscPackage.REALTIMESTATECHART__NAME: return RtscPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case RtscPackage.NAMED_ELEMENT__NAME: return RtscPackage.REALTIMESTATECHART__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", unprocessedString: ");
		result.append(unprocessedString);
		result.append(", consummedString: ");
		result.append(consummedString);
		result.append(", producedString: ");
		result.append(producedString);
		result.append(')');
		return result.toString();
	}

} //RealtimestatechartImpl