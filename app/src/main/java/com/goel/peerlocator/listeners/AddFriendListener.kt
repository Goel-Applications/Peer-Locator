package com.goel.peerlocator.listeners

import com.goel.peerlocator.models.UnknownUserModel

interface AddFriendListener {
    fun onInvitationSent (model: UnknownUserModel)
    fun onError ()
}