package com.cellsgame.game.module.chat.process;

import com.cellsgame.game.core.event.EvtParamType;
import com.cellsgame.game.core.event.GameEvent;
import com.cellsgame.game.module.chat.NotifyProcess;
import com.cellsgame.game.module.player.vo.PlayerVO;

/**
 * Created by yfzhang on 2017/7/24.
 */
public class StarMasterNotifyPro extends NotifyProcess {

    @Override
    protected String[] builderChatMsg(PlayerVO player, GameEvent e) {
        int heroCid = e.getParam(EvtParamType.HERO_CID, 0);
        int star = e.getParam(EvtParamType.STAR, 0);
        if(heroCid > 0 && star >= 3){
            return new String[]{player.getName(), String.valueOf(heroCid), String.valueOf(star)};
        }
        return null;
    }
}