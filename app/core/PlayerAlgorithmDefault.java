package core;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import static java.util.Arrays.asList;

import com.ekino.animation.devoxx.RestPlayerAlgorithm;
import com.ekino.animation.devoxx.model.World;
import com.ekino.animation.devoxx.model.actions.Action;
import com.ekino.animation.devoxx.model.actions.ActionList;
import com.ekino.animation.devoxx.model.actions.AttackAction;
import com.ekino.animation.devoxx.model.actions.Direction;
import com.ekino.animation.devoxx.model.actions.Move;
import com.ekino.animation.devoxx.model.actions.MoveAction;
import com.ekino.animation.devoxx.model.army.Ship;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class PlayerAlgorithmDefault implements RestPlayerAlgorithm {

	private static final Random random = new Random();
	private static final List<Direction> directions = asList(Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST);

	/**
	 * Compléter par votre pseudo
	 *
	 * @return votre pseudo
	 */
	@Override
	public String ping() {
		return "MrSpeaker";
	}

	/**
	 * {@inheritDoc RestPlayerAlgorithm}
	 */
	@Override
	public ActionList turn(World world) {

		List<Action> actions = new ArrayList<>();

		for (Ship ship:world.getShips()){

            MoveAction mv = new MoveAction(ship, asList(new Move(directions.get(random.nextInt(4)), random.nextInt(5))));
            actions.add(mv);

        }

		return ActionList.valueOf(ImmutableList.<Action>of());
	}
}
